SUMMARY = "A Python 3 asyncio Matrix framework"
DESCRIPTION = "A Python 3 asyncio Matrix framework."
LICENSE = "MPL-2.0"

PV = "0.19.15"

RPM_NAME = "python39-mautrix-0.19.15-1.1.noarch.rpm"
RPM_HASH = "439bbcd65b8f2cedf93b6714a5633ddc0aefa9cfe12b825b3b0afa80f9f8ca7d663411ec2d4069618e2565a08f1a34d1736a6d01f51a44fee91c6b2fe07dd0ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mautrix) \
python39-mautrix \
python3dist(mautrix)"

RDEPENDS:${PN} += "python(abi) \
python39-aiohttp \
python39-attrs \
python39-yarl"

inherit rpm
