SUMMARY = "Tree to tree correction between XML documents"
DESCRIPTION = "XMLdiff shows the differences between two similar XML files in the same \
way `diff` does with text files. It can also be used as a library or as \
a command line tool and can work either with XML files or DOM trees. \
The implementation is based on 'Change detection in hierarchically \
structured information', by S. Chawathe, A. Rajaraman, H. \
Garcia-Molina, and J. Widom, Stanford University, 1996."
LICENSE = "MIT"

PV = "2.4"

RPM_NAME = "python310-xmldiff-2.4-4.4.noarch.rpm"
RPM_HASH = "9a407f52e415e361dd4ff21d752737a1ef790f4db6b2a259aed21f94c29f90490c0061495f9734c741f3ed85f7c528850a036e4b7b8bba65cdebac35af6590f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xmldiff \
python3.10dist(xmldiff) \
python310-xmldiff \
python3dist(xmldiff)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-lxml \
python310-setuptools \
update-alternatives"

inherit rpm
