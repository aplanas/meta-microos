SUMMARY = "Management library for 'libnvdimm' subsystem devices (Non-volatile Memory)"
DESCRIPTION = "Utility library for managing the 'libnvdimm' subsystem, which defines \
a kernel device model and control message interface for platform \
NVDIMM resources like those defined by the ACPI 6.0 NFIT (NVDIMM \
Firmware Interface Table)."
LICENSE = "LGPL-2.1-only"

PV = "76"

RPM_NAME = "libndctl6-76-1.3.aarch64.rpm"
RPM_HASH = "4e213179d1447ee4a2b86656afd63cf6ec4ac1fa5a182230e6666c041f9b1674989c5fe112ab506c0c0dc90e00dbda49a6ff13f3accfe7a82ddb63cad5dce80d"

RPROVIDES:${PN} += "libcxl.so.1()(64bit) \
libcxl.so.1(LIBCXL_1)(64bit) \
libcxl.so.1(LIBCXL_2)(64bit) \
libcxl.so.1(LIBCXL_3)(64bit) \
libcxl.so.1(LIBCXL_4)(64bit) \
libdaxctl.so.1()(64bit) \
libdaxctl.so.1(LIBDAXCTL_1)(64bit) \
libdaxctl.so.1(LIBDAXCTL_2)(64bit) \
libdaxctl.so.1(LIBDAXCTL_3)(64bit) \
libdaxctl.so.1(LIBDAXCTL_4)(64bit) \
libdaxctl.so.1(LIBDAXCTL_5)(64bit) \
libdaxctl.so.1(LIBDAXCTL_6)(64bit) \
libdaxctl.so.1(LIBDAXCTL_7)(64bit) \
libdaxctl.so.1(LIBDAXCTL_8)(64bit) \
libdaxctl.so.1(LIBDAXCTL_9)(64bit) \
libndctl.so.6()(64bit) \
libndctl.so.6(LIBNDCTL_1)(64bit) \
libndctl.so.6(LIBNDCTL_13)(64bit) \
libndctl.so.6(LIBNDCTL_14)(64bit) \
libndctl.so.6(LIBNDCTL_15)(64bit) \
libndctl.so.6(LIBNDCTL_16)(64bit) \
libndctl.so.6(LIBNDCTL_17)(64bit) \
libndctl.so.6(LIBNDCTL_18)(64bit) \
libndctl.so.6(LIBNDCTL_19)(64bit) \
libndctl.so.6(LIBNDCTL_20)(64bit) \
libndctl.so.6(LIBNDCTL_21)(64bit) \
libndctl.so.6(LIBNDCTL_22)(64bit) \
libndctl.so.6(LIBNDCTL_23)(64bit) \
libndctl.so.6(LIBNDCTL_24)(64bit) \
libndctl.so.6(LIBNDCTL_25)(64bit) \
libndctl.so.6(LIBNDCTL_26)(64bit) \
libndctl.so.6(LIBNDCTL_27)(64bit) \
libndctl.so.6(LIBNDCTL_28)(64bit) \
libndctl.so.6(LIBNDCTL_3)(64bit) \
libndctl6 \
libndctl6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libkmod.so.2()(64bit) \
libkmod.so.2(LIBKMOD_5)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libuuid.so.1()(64bit)"

inherit rpm
