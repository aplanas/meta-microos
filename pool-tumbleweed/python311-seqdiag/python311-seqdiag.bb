SUMMARY = "Python module to generate sequence-diagram images from text"
DESCRIPTION = "`seqdiag` generates sequence-diagram image files from spec-text files. \
 \
* Generate sequence-diagram from dot like text (basic feature). \
* Multilingualization for node-label (UTF-8 only)."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python311-seqdiag-3.0.0-1.8.noarch.rpm"
RPM_HASH = "0cccdd59cb1f9fae68c1e1d8fae155ac2626301c2eeb5a85d0a9343c388821df000fbddab2e1b8fc3a76d0a1a8f8e396d93351ebe0dba35ec9ea655f04cc34a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-seqdiag \
python3.11dist-seqdiag \
python311-seqdiag \
python3dist-seqdiag"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-blockdiag \
python311-setuptools \
update-alternatives"

inherit rpm
