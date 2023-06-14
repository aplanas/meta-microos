SUMMARY = "Python wrapper around SoX"
DESCRIPTION = "SOX is intended to be the Swiss Army knife of sound processing tools. \
It does many things, it just does not do them all well. Sooner or later \
it will come in very handy. SOX is really only usable day-to-day if you \
hide the wacky options with one-line shell scripts. \
 \
This is a Python wrapper for SOX."
LICENSE = "BSD-3-Clause"

PV = "1.4.1"

RPM_NAME = "python311-sox-1.4.1-1.14.noarch.rpm"
RPM_HASH = "be32dd1aacb97da21b9ce3486cf59a49dd8d2b0540dd77a012f5846270981f0529e7466b4f9b66cb84e9b19e241153739783a417a2acbead132a3d86b64b547c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sox \
python311-sox \
python3dist-sox"

RDEPENDS:${PN} += "python-abi \
sox"

inherit rpm
