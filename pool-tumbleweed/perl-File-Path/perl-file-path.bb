SUMMARY = "Create or remove directory trees"
DESCRIPTION = "This module provides a convenient way to create directories of arbitrary \
depth and to delete an entire directory subtree from the filesystem."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.180000"

RPM_NAME = "perl-File-Path-2.180000-1.11.noarch.rpm"
RPM_HASH = "78623cd3ccc6c5ec53b4c9cccd72e8489989e961ad2285a3d6916b41cf6306151a2927180315e551b1373e9fb5ea96068da7b6e6e3ef6432381b2fe193587add"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(File::Path) \
perl-File-Path"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
