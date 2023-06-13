SUMMARY = "Simple, sane and efficient module to slurp a file"
DESCRIPTION = "This module provides functions for fast and correct slurping and spewing. \
All functions are optionally exported. All functions throw exceptions on \
errors, write functions don't return any meaningful value."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.014"

RPM_NAME = "perl-File-Slurper-0.014-1.2.noarch.rpm"
RPM_HASH = "56db79a097efe872698731b1c1a965d90b8bf69c495757e68d5f01f45079a81ebc40ab0980f84d7cec8a933a458aa87a9b7c6c9116a0cb3d07dada2f2112d36f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(File::Slurper) \
perl-File-Slurper"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
