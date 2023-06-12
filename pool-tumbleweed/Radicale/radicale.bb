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

RPM_NAME = "Radicale-3.1.8-2.1.noarch.rpm"
RPM_HASH = "47162e32469af5de85810e5158704c305c1b6151b9b9c2976c093a7ecd8a7e73497e2581115ea8eb0f8ed95b618278bcc73295c5e0edabf3c341c7a99a251c75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Radicale \
config(Radicale) \
group(radicale) \
python3.10dist(radicale) \
python3dist(radicale) \
user(radicale)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
python(abi) \
python3 \
python3-defusedxml \
python3-python-dateutil \
python3-vobject \
sysuser-shadow"

inherit rpm
