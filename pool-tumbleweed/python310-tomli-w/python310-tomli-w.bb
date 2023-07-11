SUMMARY = "A lil' TOML writer"
DESCRIPTION = "Tomli-W is a Python library for writing TOML. It is a write-only counterpart to Tomli, \
which is a read-only TOML parser."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-tomli-w-1.0.0-3.3.noarch.rpm"
RPM_HASH = "5e8792a3440bf6a31580cb820d80ce1a05673129818f47c6cb9e915edcc98b4b5f3ebe106ae095b0be7f144bb8b9f73a344cd63b4edfd78065901fd23a8940f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tomli-w \
python310-tomli-w \
python3dist-tomli-w"

RDEPENDS:${PN} += "python-abi"

inherit rpm
