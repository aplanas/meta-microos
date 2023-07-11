SUMMARY = "Thin wrapper for pandoc"
DESCRIPTION = "pypandoc provides a thin wrapper for pandoc, a universal document converter."
LICENSE = "MIT"

PV = "1.11"

RPM_NAME = "python311-pypandoc-1.11-1.3.noarch.rpm"
RPM_HASH = "78861dac62f8606b2443c75d830f01bd3036b3bb568a778acdd8c815289c8615c301b9b44db063be532c744f3eafa69034c87f64131a8cb55929a9b454e6994c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pypandoc \
python3.11dist-pypandoc \
python311-pypandoc \
python3dist-pypandoc"

RDEPENDS:${PN} += "pandoc \
python-abi \
python311-pip \
python311-wheel"

inherit rpm
