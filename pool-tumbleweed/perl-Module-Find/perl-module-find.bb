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

RPM_NAME = "perl-Module-Find-0.16-1.4.noarch.rpm"
RPM_HASH = "033623f08159319bdaca97ff67460a35f6bed92d24b1c0c341027ea05d29e6a889b4baa7cc2343b070debcea2f6d92e2cc3627a94c2e8a80419ef4ef2f88e469"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Find \
perl-Module-Find"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
