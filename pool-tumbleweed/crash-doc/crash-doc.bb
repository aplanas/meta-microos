SUMMARY = "Documentation for Crash"
DESCRIPTION = "This subpackage contains the crash whitepaper from Dave Anderson. \
 \
 \
 \
Authors: \
-------- \
    David Anderson <anderson@redhat.com>"
LICENSE = "GFDL-1.2-only"

PV = "8.0.3"

RPM_NAME = "crash-doc-8.0.3-2.3.aarch64.rpm"
RPM_HASH = "3b8f779ddd352a7f4452b540477597258f4268b7ffac609432e47ff0df3999b03ec31030aa0e44e057c8b0b0bd5257a97ecb2cfb48f6e94f3bb81e272c2fbac9"

RPROVIDES:${PN} += "crash-doc"

RDEPENDS:${PN} += "crash"

inherit rpm
