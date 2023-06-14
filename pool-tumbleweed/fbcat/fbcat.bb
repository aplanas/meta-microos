SUMMARY = "Framebuffer screenshot programs"
DESCRIPTION = "Contains fbcat and fbgrab for taking a screenshot using the framebuffer \
device. \
 \
Two executables are provided: \
 - Low-level fbcat that operates on the current virtual terminal and writes the \
   screenshot to stdout in the PPM format. \
 - High-level fbgrab that supports the PNG format and virtual terminal switching."
LICENSE = "GPL-2.0"

PV = "0.5.2"

RPM_NAME = "fbcat-0.5.2-1.7.aarch64.rpm"
RPM_HASH = "0045b4008ab0011bf8495860947a69f70df91763c2c93a4c2addac480a5d3e78ff16ebf0f20e01bb97d8273b526532e872c0d67d66e92ec494f59d6b132ceaa9"

RPROVIDES:${PN} += "fbcat"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
