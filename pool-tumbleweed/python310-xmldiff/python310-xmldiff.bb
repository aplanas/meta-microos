SUMMARY = "Tree to tree correction between XML documents"
DESCRIPTION = "XMLdiff shows the differences between two similar XML files in the same \
way `diff` does with text files. It can also be used as a library or as \
a command line tool and can work either with XML files or DOM trees. \
The implementation is based on 'Change detection in hierarchically \
structured information', by S. Chawathe, A. Rajaraman, H. \
Garcia-Molina, and J. Widom, Stanford University, 1996."
LICENSE = "MIT"

PV = "2.4"

RPM_NAME = "python310-xmldiff-2.4-4.6.noarch.rpm"
RPM_HASH = "be146ae56419d34966b142a12aeb23a66d1f939db878956590452820402d0f352525d97f348623f4f8279c36a9adfacc45288743c13bc9f35c3b194a89010bfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xmldiff \
python310-xmldiff \
python3dist-xmldiff"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-lxml \
python310-setuptools \
update-alternatives"

inherit rpm
