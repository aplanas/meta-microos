SUMMARY = "Modular, callback-based IRCv3 library for Python 3"
DESCRIPTION = "Pydle is a modular, callback-based IRCv3 library for Python 3. \
Features include: \
 \
* TLS \
* CTCP \
* ISUPPORT/PROTOCTL \
* WHOX \
* IRCv3.1 (full) \
* IRCv3.2 (base only, work in progress)"
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "python39-pydle-1.0.1-2.1.noarch.rpm"
RPM_HASH = "96bf949fcd88468f7a61142058e553053b756f8cb85e81c25a9c9b62c43a06148ee7797a52a0bdc2c9beb8743d86c73d306fbc08aa25423f76e4b6a39b02d203"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pydle"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.9 \
/usr/bin/sh \
python39-pure-sasl \
update-alternatives"

inherit rpm
