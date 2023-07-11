SUMMARY = "Mono Addins Framework"
DESCRIPTION = "Mono.Addins is a generic framework for creating extensible \
applications, and for creating libraries which extend those \
applications."
LICENSE = "MIT"

PV = "1.3.3"

RPM_NAME = "mono-addins-1.3.3-2.17.noarch.rpm"
RPM_HASH = "8b48b87e8dbb2fff60094a17071b297b77c74d6ad6bdd7fd8bde2ba41dde36b554052e8365ac96d3e645241ad88d29f1cdbd833cdfea5518b046282c4876a69a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono-Mono.Addins \
mono-Mono.Addins.CecilReflector \
mono-Mono.Addins.Gui \
mono-Mono.Addins.Setup \
mono-addins \
mono-mautil \
mono-policy.0.2.Mono.Addins \
mono-policy.0.2.Mono.Addins.CecilReflector \
mono-policy.0.2.Mono.Addins.Gui \
mono-policy.0.2.Mono.Addins.Setup \
mono-policy.0.3.Mono.Addins \
mono-policy.0.3.Mono.Addins.CecilReflector \
mono-policy.0.3.Mono.Addins.Gui \
mono-policy.0.3.Mono.Addins.Setup \
mono-policy.0.4.Mono.Addins \
mono-policy.0.4.Mono.Addins.CecilReflector \
mono-policy.0.4.Mono.Addins.Gui \
mono-policy.0.4.Mono.Addins.Setup \
mono-policy.0.5.Mono.Addins \
mono-policy.0.5.Mono.Addins.CecilReflector \
mono-policy.0.5.Mono.Addins.Gui \
mono-policy.0.5.Mono.Addins.Setup \
mono-policy.0.6.Mono.Addins \
mono-policy.0.6.Mono.Addins.CecilReflector \
mono-policy.0.6.Mono.Addins.Gui \
mono-policy.0.6.Mono.Addins.Setup"

RDEPENDS:${PN} += "/usr/bin/sh \
mono-ICSharpCode.SharpZipLib \
mono-Mono.Cairo \
mono-Mono.Posix \
mono-System \
mono-System.Core \
mono-System.Xml \
mono-gdk-sharp \
mono-glib-sharp \
mono-gtk-sharp \
mono-mscorlib \
mono-pango-sharp"

inherit rpm
