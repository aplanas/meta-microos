SUMMARY = "Tool for annotating images"
DESCRIPTION = "kImageAnnotator is a tool for annotating images."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.1"

RPM_NAME = "kImageAnnotator-0.6.1-1.2.aarch64.rpm"
RPM_HASH = "370d2a932166dba5948cdd5da530de3e8a6082c9480407b87148054efa2a95dd22af4ad6a8787f11c3be10e32c4d3c7bf3e77f78b55115cacd86ad97fe89688d"

RPROVIDES:${PN} += "kImageAnnotator"

RDEPENDS:${PN} += ""

inherit rpm
