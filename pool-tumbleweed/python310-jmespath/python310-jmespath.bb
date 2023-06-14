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

RPM_NAME = "python310-jmespath-1.0.1-2.4.noarch.rpm"
RPM_HASH = "667ce2eee821ef3a854d834d2b77b4f2c466b81d41b2858515919bc435e63b43c7f9e3a8e2aee036c552ea8a5ed927de0f90c6221dfcb76a9cfc8c3ca8a381ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jmespath \
python3.10dist-jmespath \
python310-jmespath \
python3dist-jmespath"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-ply \
update-alternatives"

inherit rpm
