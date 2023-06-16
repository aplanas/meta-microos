SUMMARY = "Python module for declarative JSON document element extraction"
DESCRIPTION = "JMESPath (pronounced 'jaymz path') allows you to declaratively specify how \
to extract elements from a JSON document. \
 \
For example, given this document: \
 \
{'foo': {'bar': 'baz'}} \
 \
The jmespath expression foo.bar will return 'baz'. \
 \
JMESPath also supports: \
 \
Referencing elements in a list. Given the data: \
 \
{'foo': {'bar': ['one', 'two']}} \
 \
The expression: foo.bar[0] will return 'one'. You can also reference all \
the items in a list using the * syntax: \
 \
{'foo': {'bar': [{'name': 'one'}, {'name': 'two'}]}} \
 \
The expression: foo.bar[*].name will return ['one', 'two']. Negative \
indexing is also supported (-1 refers to the last element in the list). \
Given the data above, the expression foo.bar[-1].name will return ['two']. \
 \
The * can also be used for hash types: \
 \
{'foo': {'bar': {'name': 'one'}, 'baz': {'name': 'two'}}} \
 \
The expression: foo.*.name will return ['one', 'two']."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python39-jmespath-1.0.1-2.4.noarch.rpm"
RPM_HASH = "101955e30aec49b1d41b9067e9b3d5115d38b8230517029b0034984dc89ff00d7d20466c5579804c81df45a033424e749bca9a69896cae0895f23165bc0e9734"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jmespath \
python39-jmespath \
python3dist-jmespath"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-ply \
update-alternatives"

inherit rpm
