SUMMARY = "A lil' TOML writer"
DESCRIPTION = "Tomli-W is a Python library for writing TOML. It is a write-only counterpart to Tomli, \
which is a read-only TOML parser."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-tomli-w-1.0.0-3.3.noarch.rpm"
RPM_HASH = "3476e5269922542281983d15d92ae2d77524d874313cc34d7e498e96b20a9b8ad521ef0f777101cb815d2ab1d8f26efe7ed97b5fc8506b520a2b0b068289eca4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tomli-w \
python39-tomli-w \
python3dist-tomli-w"

RDEPENDS:${PN} += "python-abi"

inherit rpm
