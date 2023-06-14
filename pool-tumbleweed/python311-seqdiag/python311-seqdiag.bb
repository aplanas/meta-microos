SUMMARY = "Python module to generate sequence-diagram images from text"
DESCRIPTION = "`seqdiag` generates sequence-diagram image files from spec-text files. \
 \
* Generate sequence-diagram from dot like text (basic feature). \
* Multilingualization for node-label (UTF-8 only)."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python311-seqdiag-3.0.0-1.6.noarch.rpm"
RPM_HASH = "23f4a284f3d2dd83988d2cdac9f4b3cee88e5444fd420daf4b60afedc3399a896c03208a77eb824a749d56998efc9de2ab2aa98572c67e0d4310b0ecf8bc1707"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-seqdiag \
python311-seqdiag \
python3dist-seqdiag"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-blockdiag \
python311-setuptools \
update-alternatives"

inherit rpm
