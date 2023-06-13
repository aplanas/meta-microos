SUMMARY = "Creating atom-shell (electron) app packages"
DESCRIPTION = "Asar is a simple extensive archive format, it works like tar \
that concatenates all files together without compression, while \
having random access support."
LICENSE = "MIT & ISC"

PV = "3.2.3"

RPM_NAME = "asar-3.2.3-1.3.noarch.rpm"
RPM_HASH = "7bb3ba254575c9889a88cab80df131b9e1efc7e5d4e1f7884167e9bad2012b1189d6c49c7e19da890a9286971e459326ee1d2d937c7a16a3ad1c295963ffd1c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "asar \
nodejs-asar \
npm(@electron/asar) \
own(balanced-match) \
own(brace-expansion) \
own(chromium-pickle-js) \
own(commander) \
own(concat-map) \
own(fs.realpath) \
own(glob) \
own(inflight) \
own(inherits) \
own(minimatch) \
own(once) \
own(path-is-absolute) \
own(wrappy)"

RDEPENDS:${PN} += "/usr/bin/node \
nodejs(engine)"

inherit rpm
