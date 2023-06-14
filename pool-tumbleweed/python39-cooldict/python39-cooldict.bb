SUMMARY = "dict-like structures for Python"
DESCRIPTION = "cooldict provides some dict-like structures for Python, such as \
* a write-through cache around another dict \
* a finalizable dict \
* a branching dict \
* a copy-on-write dict (with and without sinkholing capability)"
LICENSE = "BSD-2-Clause"

PV = "1.04"

RPM_NAME = "python39-cooldict-1.04-1.14.noarch.rpm"
RPM_HASH = "638a1f3fcf56e8bbd844d22c256b1edf83b560d9b645f666c4986cb05dddb416ec2c086ad71969653f9490b5fdaaa04cce14180608d988a07e19ffe5f42a4d9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cooldict \
python39-cooldict \
python3dist-cooldict"

RDEPENDS:${PN} += "python-abi \
python39-ana"

inherit rpm
