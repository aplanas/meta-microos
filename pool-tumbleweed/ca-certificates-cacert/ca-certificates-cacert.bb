SUMMARY = "CAcert root certificates"
DESCRIPTION = "This package contains the root certificates from cacert.org"
LICENSE = "SUSE-CacertRoot"

PV = "1"

RPM_NAME = "ca-certificates-cacert-1-23.3.noarch.rpm"
RPM_HASH = "9ba2bc6bc5d8f650955e104ba265428178a6755f1477fd58cb63aa9271f55fee4669b5011be0bebddb9fb1ad40d3b3ea9f01541bda4bf639ed96c98d709db94a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ca-certificates-cacert"

RDEPENDS:${PN} += "/usr/bin/sh \
ca-certificates"

inherit rpm
