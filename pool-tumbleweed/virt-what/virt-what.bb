SUMMARY = "Detect if running in a virtual machine"
DESCRIPTION = "This is a collection of scripts which you can use to work out what \
sort of virtualization you are running inside.  Please read the manual \
page virt-what(1) to find out how to use it.  This file is for \
developers and people compiling from source."
LICENSE = "GPL-2.0-or-later"

PV = "1.25"

RPM_NAME = "virt-what-1.25-1.2.aarch64.rpm"
RPM_HASH = "24239f073d21ef2dfff1f678ef386e48fb7293f6574dca43b9ae44d7c803517eff38f13c5e9fb9ba83efb60630bc9408552fee77b0ada3a723b19e7a1512195f"

RPROVIDES:${PN} += "virt-what"

RDEPENDS:${PN} += "/bin/sh \
dmidecode \
libc.so.6 \
util-linux \
which"

inherit rpm
