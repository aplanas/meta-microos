SUMMARY = "Building, finding and using wxWidgets binaries"
DESCRIPTION = "Please see Alien for the manifesto of the Alien namespace. \
 \
In short 'Alien::wxWidgets' can be used to detect and get configuration \
settings from an installed wxWidgets."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.69"

RPM_NAME = "perl-Alien-wxWidgets-0.69-1.16.aarch64.rpm"
RPM_HASH = "a66cdb5407c798a5f70d83245453506a5f93f420c30a1a5519b6e28313208e4a25b7a122ac7484a777c01a6c7141adcf750116f3faebcd517eadc774a0325c78"

RPROVIDES:${PN} += "perl(Alien::wxWidgets) \
perl(Alien::wxWidgets::Config::gtk2_3_0_5_uni_gcc_3_4) \
perl(Alien::wxWidgets::Utility) \
perl-Alien-wxWidgets \
perl-Alien-wxWidgets(aarch-64)"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Module::Pluggable)"

inherit rpm
