SUMMARY = "Open Object Rexx development files"
DESCRIPTION = "This package contains headers and files needed for developing extensions for \
Open Object Rexx."
LICENSE = "CPL-1.0"

PV = "4.2.0"

RPM_NAME = "ooRexx-devel-4.2.0-18.13.aarch64.rpm"
RPM_HASH = "a8491cedab239b7acfcc8252df4ab9cec51e59d789453719c7488d9826fecc186f4dd34eb15984ed8c953a236e479b4cfdce3c38c885fc70fd3e248b531952f3"

RPROVIDES:${PN} += "ooRexx-devel \
pkgconfig-ooRexx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
ooRexx"

inherit rpm
