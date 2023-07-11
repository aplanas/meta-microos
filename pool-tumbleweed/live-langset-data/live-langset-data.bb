SUMMARY = "Scripts and data to allow locale switching in live media"
DESCRIPTION = "This package contains scripts and data to allow setting the locale (+ console font and keyboard \
layout) on live media."
LICENSE = "GPL-2.0-only"

PV = "2.0"

RPM_NAME = "live-langset-data-2.0-17.3.noarch.rpm"
RPM_HASH = "f0ffad0cb0c641a750ee704a2f397f3efb7b39bcae5ccd1a0193a3cff8fa7c79b3313a5c7b14c5167fff538fe32ff1b3620b8c1070390328b16b0e9cc3a902ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "live-langset-data"

RDEPENDS:${PN} += "/usr/bin/sh \
sed \
systemd"

inherit rpm
