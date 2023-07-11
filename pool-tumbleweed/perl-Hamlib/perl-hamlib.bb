SUMMARY = "Perl bindings for Hamlib"
DESCRIPTION = "Hamlib provide a programming interface for controlling radios and \
other shack hardware."
LICENSE = "LGPL-2.1-only"

PV = "4.5.5"

RPM_NAME = "perl-Hamlib-4.5.5-2.2.aarch64.rpm"
RPM_HASH = "da1d4d135acdc7004cd438d70205902e9336461d90d2f2d0c73d329446fe04edd34af9aa5578667be9e4c72f8cdeba3edf5cd60884d1205f3c9c1e8a269bc87d"

RPROVIDES:${PN} += "perl-Hamlib \
perl-Hamlib--Amp \
perl-Hamlib--Rig \
perl-Hamlib--Rot \
perl-Hamlib--cal-table \
perl-Hamlib--cal-table-float \
perl-Hamlib--cal-table-float-table \
perl-Hamlib--cal-table-table \
perl-Hamlib--chan-list \
perl-Hamlib--channel \
perl-Hamlib--channel-cap \
perl-Hamlib--channelArray \
perl-Hamlib--confparams \
perl-Hamlib--confparams-u \
perl-Hamlib--confparams-u-c \
perl-Hamlib--confparams-u-n \
perl-Hamlib--ext-list \
perl-Hamlib--filter-list \
perl-Hamlib--freq-range-t \
perl-Hamlib--gran \
perl-Hamlib--hamlib-port-deprecated-parm \
perl-Hamlib--hamlib-port-deprecated-parm-cm108 \
perl-Hamlib--hamlib-port-deprecated-parm-gpio \
perl-Hamlib--hamlib-port-deprecated-parm-parallel \
perl-Hamlib--hamlib-port-deprecated-parm-serial \
perl-Hamlib--hamlib-port-deprecated-parm-usb \
perl-Hamlib--hamlib-port-deprecated-post-write-date \
perl-Hamlib--hamlib-port-deprecated-type \
perl-Hamlib--hamlib-port-parm \
perl-Hamlib--hamlib-port-parm-cm108 \
perl-Hamlib--hamlib-port-parm-gpio \
perl-Hamlib--hamlib-port-parm-parallel \
perl-Hamlib--hamlib-port-parm-serial \
perl-Hamlib--hamlib-port-parm-usb \
perl-Hamlib--hamlib-port-post-write-date \
perl-Hamlib--hamlib-port-t \
perl-Hamlib--hamlib-port-t-deprecated \
perl-Hamlib--hamlib-port-type \
perl-Hamlib--rig-cache \
perl-Hamlib--rig-callbacks \
perl-Hamlib--rig-caps \
perl-Hamlib--rig-spectrum-avg-mode \
perl-Hamlib--rig-spectrum-line \
perl-Hamlib--rig-spectrum-scope \
perl-Hamlib--rig-state \
perl-Hamlib--rot-caps \
perl-Hamlib--rot-state \
perl-Hamlib--s-rig \
perl-Hamlib--s-rot \
perl-Hamlib--toneArray \
perl-Hamlib--tuning-step-list \
perl-Hamlib--value-t \
perl-Hamlib--value-t-b \
perl-Hamlibc"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhamlib.so.4 \
perl-base"

inherit rpm
