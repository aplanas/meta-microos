SUMMARY = "A scanner for Rootkits, Backdoors, and Local Exploits"
DESCRIPTION = "Rootkit Hunter scans files and systems for known and unknown rootkits, \
backdoors, and sniffers.  The package contains one shell script, a few \
text-based databases, and optional Perl modules. This tool scans for \
rootkits, backdoors, and local exploits by running tests like: \
 \
* Comparing MD5 hashes \
 \
* Looking for default files used by rootkits \
 \
* Checking for wrong file permissions for binaries \
 \
* Looking for suspected strings in LKM and KLD modules \
 \
* Looking for hidden files \
 \
* Optionally scanning within plain text and binary files \
 \
* Checking software versions \
 \
* Testing applications"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "rkhunter-1.4.6-8.2.aarch64.rpm"
RPM_HASH = "3fd1f794e28be6843140ac1aa587bfeecc72e870dfa92b791d3d3f908b44fd29639899feec6c11ad99144ea7d3e41e5b18b68274b466e9ac9d4295a5718ad8b9"

RPROVIDES:${PN} += "config-rkhunter \
rkhunter"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
bash \
fillup \
findutils"

inherit rpm
