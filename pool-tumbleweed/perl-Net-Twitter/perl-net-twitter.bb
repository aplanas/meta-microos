SUMMARY = "Perl Interface to the Twitter Api"
DESCRIPTION = "This module has been superseded by Twitter::API. Please update as soon as \
you possibly can to use new features and the new API versions. This module \
will no longer be supported. \
 \
This module provides a perl interface to the Twitter APIs. See \
http://dev.twitter.com/docs for a full description of the Twitter APIs."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "4.01043"

RPM_NAME = "perl-Net-Twitter-4.01043-1.19.noarch.rpm"
RPM_HASH = "7348d824ec7cad04534445cb357edd0d1ec57f89b80d5c070772ccd7c5e165a5d7c92008d273dc6ce22630fd79b0a0db5e1a1adf74fc93ca785076cb96f67650"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
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
