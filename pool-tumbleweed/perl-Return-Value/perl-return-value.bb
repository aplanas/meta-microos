SUMMARY = "(deprecated) polymorphic return values"
DESCRIPTION = "Polymorphic return values are a horrible idea, but this library was written \
based on the notion that they were useful. Often, we just want to know if \
something worked or not. Other times, we'd like to know what the error text \
was. Still others, we may want to know what the error code was, and what \
the error properties were. We don't want to handle objects or data \
structures for every single return value, but we do want to check error \
conditions in our code because that's what good programmers do. \
 \
When functions are successful they may return true, or perhaps some useful \
data. In the quest to provide consistent return values, this gets confusing \
between complex, informational errors and successful return values. \
 \
This module provides these features with a simplistic API that should get \
you what you're looking for in each context a return value is used in."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.666005"

RPM_NAME = "perl-Return-Value-1.666005-1.21.noarch.rpm"
RPM_HASH = "2ad0eae06e60d64124e8332e506894d97e2d0c7758ba94ab0ddae0c2fd9f82d755640b6a356ed00bb83f623f7de1ae675e9a2bd5adc82085b76a0d52fc21a113"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Return--Value \
perl-Return-Value"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
