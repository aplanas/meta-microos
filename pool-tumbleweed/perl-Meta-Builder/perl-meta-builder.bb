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

RPM_NAME = "perl-Meta-Builder-0.004-1.18.noarch.rpm"
RPM_HASH = "82efb9d296a025c08b547e937e9697ac26343c7ec918d06fb635767ba531826fc2851c388449ca6fbe363b12bc6224b6d60d49d7cf9eb2a0369efde7bb952dae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Meta--Builder \
perl-Meta--Builder--Base \
perl-Meta--Builder--Util \
perl-Meta-Builder"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
