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

RPM_NAME = "python311-jmespath-1.0.1-2.6.noarch.rpm"
RPM_HASH = "8cb7052ceaa1a380f0ab50324c035b8950d2f89a17575cc22d92f9a8392135783d11afe30e76816cf76be0201e5a383e0e5f9dd7ce432546cb3ef7054dc88f63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jmespath \
python3.11dist-jmespath \
python311-jmespath \
python3dist-jmespath"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-ply \
update-alternatives"

inherit rpm
