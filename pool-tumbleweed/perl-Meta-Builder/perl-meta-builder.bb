SUMMARY = "Tools for creating Meta objects to track custom metrics"
DESCRIPTION = "Meta programming is becoming more and more popular. The popularity of Meta \
programming comes from the fact that many problems are made significantly \
easier. There are a few specialized Meta tools out there, for instance \
Class:MOP which is used by Moose to track class metadata. \
 \
Meta::Builder is designed to be a generic tool for writing Meta objects. \
Unlike specialized tools, Meta::Builder makes no assumptions about what \
metrics you will care about. Meta::Builder also makes it simple for others \
to extend your meta-object based tools by providing hooks for other \
packages to add metrics to your meta object. \
 \
If a specialized Meta object tool is available to meet your needs please \
use it. However if you need a simple Meta object to track a couple metrics, \
use Meta::Builder. \
 \
Meta::Builder is also low-sugar and low-dep. In most cases you will not \
want a class that needs a meta object to use your meta-object class \
directly. Rather you will usually want to create a sugar class that exports \
enhanced API functions that manipulate the meta object."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.004"

RPM_NAME = "perl-Meta-Builder-0.004-1.19.noarch.rpm"
RPM_HASH = "dc27a56f729f0fc6bd97888a43c15271211cd86bd8cea47c2adb4064a8767073e55e0f26d9d51c00b21c3ac9f31ce12723c97b557bac8cd8e313886039a6e1cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Meta--Builder \
perl-Meta--Builder--Base \
perl-Meta--Builder--Util \
perl-Meta-Builder"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
