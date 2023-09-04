SUMMARY = "Hex Editor data files"
DESCRIPTION = "Data files used by Okteta/libKasten, e.g. structures definitions."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.13"

RPM_NAME = "okteta-data-0.26.13-1.1.noarch.rpm"
RPM_HASH = "27010e319cab9b378c000ff84b8850cf876c24b8319baadb417351b07193abec87972cf39f8b7e1f47aa17dbbfc4c73ec1446011ea23f970f692583e49d60d51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "okteta-data"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
