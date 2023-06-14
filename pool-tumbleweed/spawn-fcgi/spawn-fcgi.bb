SUMMARY = "Spawn FastCGI applications independent of the webserver"
DESCRIPTION = "spawn-fcgi is used to spawn FastCGI applications independent of the webserver. \
 \
Authors: \
--------- \
    Jan Kneschke \
    Stefan Buehler"
LICENSE = "BSD-3-Clause"

PV = "1.6.4"

RPM_NAME = "spawn-fcgi-1.6.4-1.27.aarch64.rpm"
RPM_HASH = "55c40304ace320bb9fa47e782641af51eb63cefa6b5ffe8413d249896fcacd419b9e688e91d2c6c24fce87e2bca9edba2f57647019b6a7bce223c72859dcfae7"

RPROVIDES:${PN} += "spawn-fcgi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
