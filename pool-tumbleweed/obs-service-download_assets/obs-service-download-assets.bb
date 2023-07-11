SUMMARY = "An OBS source service: Wrapper for download_assets"
DESCRIPTION = "A small wrapper to make download_assets from the build script usable \
via a source service."
LICENSE = "GPL-2.0-or-later"

PV = "0.2"

RPM_NAME = "obs-service-download_assets-0.2-1.1.noarch.rpm"
RPM_HASH = "f02f4efaabcbbd29824b55dba48268b9eac128faf733d658f25fd5f9878debc0bfad6eeb8fc1b4ceba96910bacd3e9e5202fdf236585b48523d0ac1b2187fd73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-obs-service-download-assets \
obs-service-download-assets"

RDEPENDS:${PN} += "/usr/bin/env \
build"

inherit rpm
