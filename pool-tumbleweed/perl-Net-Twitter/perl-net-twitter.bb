SUMMARY = "Perl Interface to the Twitter Api"
DESCRIPTION = "This module has been superseded by Twitter::API. Please update as soon as \
you possibly can to use new features and the new API versions. This module \
will no longer be supported. \
 \
This module provides a perl interface to the Twitter APIs. See \
http://dev.twitter.com/docs for a full description of the Twitter APIs."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "4.01043"

RPM_NAME = "perl-Net-Twitter-4.01043-1.20.noarch.rpm"
RPM_HASH = "7b3510926d732f07fd0e0fbbd737c70cd98a509a80e0b725c69fbb28b1a408468ca6ae5bf008e56a5b8029596004bc5831ba3bb5dd0839addd2335e0ab133812"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--Identica \
perl-Net--Twitter \
perl-Net--Twitter--API \
perl-Net--Twitter--Core \
perl-Net--Twitter--Error \
perl-Net--Twitter--Meta--Method \
perl-Net--Twitter--OAuth \
perl-Net--Twitter--Role--API--Lists \
perl-Net--Twitter--Role--API--REST \
perl-Net--Twitter--Role--API--RESTv1-1 \
perl-Net--Twitter--Role--API--Search \
perl-Net--Twitter--Role--API--Search--Trends \
perl-Net--Twitter--Role--API--TwitterVision \
perl-Net--Twitter--Role--API--Upload \
perl-Net--Twitter--Role--API--UploadMedia \
perl-Net--Twitter--Role--AppAuth \
perl-Net--Twitter--Role--AutoCursor \
perl-Net--Twitter--Role--InflateObjects \
perl-Net--Twitter--Role--Legacy \
perl-Net--Twitter--Role--OAuth \
perl-Net--Twitter--Role--RateLimit \
perl-Net--Twitter--Role--RetryOnError \
perl-Net--Twitter--Role--SimulateCursors \
perl-Net--Twitter--Role--WrapError \
perl-Net--Twitter--Role--WrapResult \
perl-Net--Twitter--Search \
perl-Net--Twitter--Types \
perl-Net--Twitter--WrappedResult \
perl-Net-Twitter"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Carp--Clan \
perl-Class--Load \
perl-Data--Visitor--Callback \
perl-DateTime \
perl-DateTime--Format--Strptime \
perl-Devel--StackTrace \
perl-Digest--SHA \
perl-HTML--Entities \
perl-HTTP--Request--Common \
perl-IO--Socket--SSL \
perl-JSON--MaybeXS \
perl-LWP--Protocol--https \
perl-Moose \
perl-Moose--Exporter \
perl-Moose--Meta--Method \
perl-Moose--Role \
perl-Moose--Util--TypeConstraints \
perl-MooseX--Role--Parameterized \
perl-Net--HTTP \
perl-Net--OAuth \
perl-Try--Tiny \
perl-URI \
perl-URI--Escape \
perl-namespace--autoclean"

inherit rpm
