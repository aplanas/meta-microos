SUMMARY = "Tree to tree correction between XML documents"
DESCRIPTION = "XMLdiff shows the differences between two similar XML files in the same \
way `diff` does with text files. It can also be used as a library or as \
a command line tool and can work either with XML files or DOM trees. \
The implementation is based on 'Change detection in hierarchically \
structured information', by S. Chawathe, A. Rajaraman, H. \
Garcia-Molina, and J. Widom, Stanford University, 1996."
LICENSE = "MIT"

PV = "2.4"

RPM_NAME = "python39-xmldiff-2.4-4.6.noarch.rpm"
RPM_HASH = "6c6fcb7195a5400819521474e3a84ef5b798615243d8794c7a44de9a708b9f5755a085de04c503ee6cf5720424d620536b42342b37da04811687d885f5a9fdd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xmldiff \
python39-xmldiff \
python3dist-xmldiff"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-lxml \
python39-setuptools \
update-alternatives"

inherit rpm
