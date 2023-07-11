SUMMARY = "The sysconfig scheme for traditional network scripts"
DESCRIPTION = "This package provides the SUSE system configuration scheme for the \
traditional 'ifup' alias 'netcontrol' network scripts."
LICENSE = "GPL-2.0-or-later"

PV = "0.90.0"

RPM_NAME = "sysconfig-0.90.0-3.3.aarch64.rpm"
RPM_HASH = "da1e8cf51041bf8182fde1a69f6d588056f6d4236c39d0cf9034838916228ec96696a33eb5d0f6d1e568c003b6da60957f71fbac4db1f8edd1a71b80d5771aa9"

RPROVIDES:${PN} += "config-sysconfig \
sysconfig"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/bash \
/usr/bin/chmod \
/usr/bin/grep \
/usr/bin/mkdir \
/usr/bin/touch \
fillup"

inherit rpm
