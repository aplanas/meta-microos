SUMMARY = "An exporter with the features of Sub::Exporter but only core dependencies"
DESCRIPTION = "Exporter::Tiny supports many of Sub::Exporter's external-facing features \
including renaming imported functions with the '-as', '-prefix' and \
'-suffix' options; explicit destinations with the 'into' option; and \
alternative installers with the 'installer' option. But it's written in \
only about 40% as many lines of code and with zero non-core dependencies. \
 \
Its internal-facing interface is closer to Exporter.pm, with configuration \
done through the '@EXPORT', '@EXPORT_OK' and '%EXPORT_TAGS' package \
variables. \
 \
If you are trying to *write* a module that inherits from Exporter::Tiny, \
then look at: \
 \
  * Exporter::Tiny::Manual::QuickStart \
 \
  * Exporter::Tiny::Manual::Exporting \
 \
If you are trying to *use* a module that inherits from Exporter::Tiny, then \
look at: \
 \
  * Exporter::Tiny::Manual::Importing"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.006002"

RPM_NAME = "perl-Exporter-Tiny-1.006002-1.1.noarch.rpm"
RPM_HASH = "432360e914e4a5ab8e4f2e524a62b16fa642b5bc1b5ce58c9a4747145322f0231b723ab5171bfc14eff4323475adc39f6c55b64c05e940ad7cedb5b617bc9949"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Exporter--Shiny \
perl-Exporter--Tiny \
perl-Exporter-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
