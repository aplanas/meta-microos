SUMMARY = "PEP 567 (context variables) backport"
DESCRIPTION = "PEP 567 (Context Variables) backport."
LICENSE = "Apache-2.0"

PV = "2.4"

RPM_NAME = "python311-contextvars-2.4-4.1.noarch.rpm"
RPM_HASH = "bf522b040e56e08c01b1ebde37e002f27c56e5c4d16af03f0448b4add2c74848efc486889403a2761e9be5050a53767efec4b2671203b2d1bcf6257f1616ec3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-contextvars \
python311-contextvars \
python3dist-contextvars"

RDEPENDS:${PN} += "python-abi \
python311-immutables"

inherit rpm
