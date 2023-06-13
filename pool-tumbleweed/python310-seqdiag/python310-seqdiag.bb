SUMMARY = "Python module to generate sequence-diagram images from text"
DESCRIPTION = "`seqdiag` generates sequence-diagram image files from spec-text files. \
 \
* Generate sequence-diagram from dot like text (basic feature). \
* Multilingualization for node-label (UTF-8 only)."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python310-seqdiag-3.0.0-1.6.noarch.rpm"
RPM_HASH = "c1b159a6c5e2cf0affd873d9c50905bcde251c06d3130aa5e668a711e8488fd22b8b066fc7e42f1424dbb61189fd821f892fe4dc1a1d51ce492c4095f06491ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-seqdiag \
python3.10dist(seqdiag) \
python310-seqdiag \
python3dist(seqdiag)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-blockdiag \
python310-setuptools \
update-alternatives"

inherit rpm
