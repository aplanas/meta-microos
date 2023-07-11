SUMMARY = "A simple future-based async library for python"
DESCRIPTION = "A simple future-based async library for python."
LICENSE = "Apache-2.0"

PV = "0.2.8"

RPM_NAME = "python310-duet-0.2.8-1.3.noarch.rpm"
RPM_HASH = "94cc751af4138cba726ecdf4ee57355d8269677473218e913d3d0a8fffa5444fea0081e8499c6197417b513155286d2932c20e2b60cae377e680ea6e8061cf4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-duet \
python310-duet \
python3dist-duet"

RDEPENDS:${PN} += "python-abi \
python310-typing-extensions"

inherit rpm
