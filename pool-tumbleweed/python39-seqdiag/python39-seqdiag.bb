SUMMARY = "Python module to generate sequence-diagram images from text"
DESCRIPTION = "`seqdiag` generates sequence-diagram image files from spec-text files. \
 \
* Generate sequence-diagram from dot like text (basic feature). \
* Multilingualization for node-label (UTF-8 only)."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python39-seqdiag-3.0.0-1.6.noarch.rpm"
RPM_HASH = "ec41fbb1e3ac8a40012b33e6ee500a1f331daa9b779c4e173d9d46e8b46dc4cb8fc5ea11b76df7ef884d80f517f357bc77638cdf942e73614c74bf69ee2889e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(seqdiag) \
python39-seqdiag \
python3dist(seqdiag)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-blockdiag \
python39-setuptools \
update-alternatives"

inherit rpm
