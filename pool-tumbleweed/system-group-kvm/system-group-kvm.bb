SUMMARY = "System group kvm"
DESCRIPTION = "This package provides the system group 'kvm'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-group-kvm-20170617-24.16.noarch.rpm"
RPM_HASH = "9f2e8bebe799d080d6f06fd2756a5441e1a3a7aabd5fc7b49a898f10045c6c43c53f54e59c9468d197af8f8de9915f6075dcab8569d189a495a2e1fbc80ae2d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-kvm \
system-group-kvm"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
