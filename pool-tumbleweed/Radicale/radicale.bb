SUMMARY = "A CalDAV calendar and CardDav contact server"
DESCRIPTION = "Radicale is a server for CalDAV (calendars, to-do lists) and CardDAV (contacts). \
 \
* Shares calendars and contact lists through CalDAV, CardDAV and HTTP. \
* Supports events, todos, journal entries and business cards. \
* Works out-of-the-box, no setup or configuration required. \
* Can limit access by authentication. \
* Can secure connections with TLS. \
* Works with many CalDAV and CardDAV clients. \
* Stores all data on the file system in a directory structure. \
* Can be extended with plugins."
LICENSE = "GPL-3.0-or-later"

PV = "3.1.8"

RPM_NAME = "Radicale-3.1.8-2.2.noarch.rpm"
RPM_HASH = "10c2989f36a273b175d59ee118a7477cf2da2636707a066b3e327457104e595a9540d32548af988f193f14f54c6ddbc4d4a195b867504da1bbcc4b0fc5c61801"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Radicale \
config-Radicale \
group-radicale \
python3.11dist-radicale \
python3dist-radicale \
user-radicale"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3 \
python3-defusedxml \
python3-python-dateutil \
python3-vobject \
sysuser-shadow"

inherit rpm
