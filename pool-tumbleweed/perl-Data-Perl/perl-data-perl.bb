SUMMARY = "Base classes wrapping fundamental Perl data types"
DESCRIPTION = "Data::Perl is a collection of classes that wrap fundamental data types that \
exist in Perl. These classes and methods as they exist today are an attempt \
to mirror functionality provided by Moose's Native Traits. One important \
thing to note is all classes currently do no validation on constructor \
input. \
 \
Data::Perl is a container class for the following classes: \
 \
* * Data::Perl::Collection::Hash \
 \
* * Data::Perl::Collection::Array \
 \
* * Data::Perl::String \
 \
* * Data::Perl::Number \
 \
* * Data::Perl::Counter \
 \
* * Data::Perl::Bool \
 \
* * Data::Perl::Code"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.002011"

RPM_NAME = "perl-Data-Perl-0.002011-1.14.noarch.rpm"
RPM_HASH = "6dd4a6f0848c47e03de50fc5fed666e66366f64b84f5cdcab368219625e1568a891f63ea66965494984666fec6114214b6d8e8c5fb9a97e8db7370d1e6ceec0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Perl \
perl-Data--Perl--Bool \
perl-Data--Perl--Code \
perl-Data--Perl--Collection--Array \
perl-Data--Perl--Collection--Hash \
perl-Data--Perl--Counter \
perl-Data--Perl--Number \
perl-Data--Perl--Role--Bool \
perl-Data--Perl--Role--Code \
perl-Data--Perl--Role--Collection--Array \
perl-Data--Perl--Role--Collection--Hash \
perl-Data--Perl--Role--Counter \
perl-Data--Perl--Role--Number \
perl-Data--Perl--Role--String \
perl-Data--Perl--String \
perl-Data-Perl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Method--Modifiers \
perl-List--MoreUtils \
perl-Module--Runtime \
perl-Role--Tiny \
perl-parent \
perl-strictures"

inherit rpm
