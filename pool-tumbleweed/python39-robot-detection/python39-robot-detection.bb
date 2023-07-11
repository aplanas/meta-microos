SUMMARY = "HTTP User Agent Bot Detection"
DESCRIPTION = "Library for detecting if a HTTP User Agent header is likely to be a bot."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.0"

RPM_NAME = "python39-robot-detection-0.4.0-3.1.noarch.rpm"
RPM_HASH = "6eb9ba47654e4464c0cf890f64e24f38fe39e48270ca8a053d200f9459bfd342b4070280349eb3137688650f4ad051a1d68dc79f29b8f2550a10fa6d9b52bfb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-robot-detection \
python39-robot-detection \
python3dist-robot-detection"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
