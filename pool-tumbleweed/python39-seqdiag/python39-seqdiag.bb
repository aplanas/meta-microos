SUMMARY = "Python module to generate sequence-diagram images from text"
DESCRIPTION = "`seqdiag` generates sequence-diagram image files from spec-text files. \
 \
* Generate sequence-diagram from dot like text (basic feature). \
* Multilingualization for node-label (UTF-8 only)."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python39-seqdiag-3.0.0-1.8.noarch.rpm"
RPM_HASH = "73f9cc40824fd504f8be8ec4925286e96e3f5af2542b2b0267137f817f0881d827b29f13c9e71774e09ab3e100d9828785e3be37e3900960282ecc9f9f125244"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-seqdiag \
python39-seqdiag \
python3dist-seqdiag"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-blockdiag \
python39-setuptools \
update-alternatives"

inherit rpm
