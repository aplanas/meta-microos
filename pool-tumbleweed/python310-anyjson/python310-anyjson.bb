SUMMARY = "Provide the best available JSON implementation available"
DESCRIPTION = "Anyjson loads whichever is the fastest JSON module installed and provides \
a uniform API regardless of which JSON implementation is used. \
 \
Originally part of carrot (https://github.com/ask/carrot/)"
LICENSE = "BSD-3-Clause"

PV = "0.3.3+git.1298315003.7bb1d18"

RPM_NAME = "python310-anyjson-0.3.3+git.1298315003.7bb1d18-2.3.noarch.rpm"
RPM_HASH = "d4f4bf5955f7ca177ace2937e4793887978df421ced90a22c5c8c6f627188edd5d425cbc575226ce94533ed43ba8a6c9e51d495ec8215a88758b231b95b2da1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-anyjson \
python3.10dist(anyjson) \
python310-anyjson \
python3dist(anyjson)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
