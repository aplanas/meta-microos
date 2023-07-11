SUMMARY = "Find and use installed modules in a (sub)category"
DESCRIPTION = "Module::Find lets you find and use modules in categories. This can be very \
useful for auto-detecting driver or plugin modules. You can differentiate \
between looking in the category itself or in all subcategories. \
 \
If you want Module::Find to search in a certain directory on your harddisk \
(such as the plugins directory of your software installation), make sure \
you modify '@INC' before you call the Module::Find functions."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.16"

RPM_NAME = "perl-Module-Find-0.16-1.3.noarch.rpm"
RPM_HASH = "854277a449cff7d4e8146d28ac6c3e2c4bb94b42baf312a90d542838ee6c54ea7d0d6b6e2a8a256ee5763ba0c596f92390753c114609367099aec8b1f2f194a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Find \
perl-Module-Find"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
