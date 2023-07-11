SUMMARY = "A lil' TOML writer"
DESCRIPTION = "Tomli-W is a Python library for writing TOML. It is a write-only counterpart to Tomli, \
which is a read-only TOML parser."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-tomli-w-1.0.0-3.3.noarch.rpm"
RPM_HASH = "530f8d4929b84968b18487fbab5b91178c7375909ce151e966687d78d828cd42fe4a0bd02b4824bffc5c0843c715f56b026d4c1fc9822f5859ecf7830ee4a36e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tomli-w \
python3.11dist-tomli-w \
python311-tomli-w \
python3dist-tomli-w"

RDEPENDS:${PN} += "python-abi"

inherit rpm
