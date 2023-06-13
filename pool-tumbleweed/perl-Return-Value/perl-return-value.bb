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

RPM_NAME = "perl-Return-Value-1.666005-1.20.noarch.rpm"
RPM_HASH = "3dec19d7d4aa80c691bcea0d671856f450f84daff2b9bc0dde7a6955d568e80fc870ae05b6b4f99ae03ced31d24765f99af78ebfa3fb3c54a400e14968f1e69f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Return::Value) \
perl-Return-Value"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
