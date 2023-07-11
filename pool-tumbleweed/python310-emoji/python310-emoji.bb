SUMMARY = "Emoji for Python"
DESCRIPTION = "This Python module provides unicode emoji output for strings containing emoji codes. \
In addition to the official list defined by the unicode consortium a whole bunch of aliases is defined. \
 \
Example: \
>> import emoji \
>> print(emoji.emojize('Python is :thumbs_up:')) \
Python is 👍 \
>> print(emoji.emojize('Python is :thumbsup:', use_aliases=True)) \
Python is 👍 \
 \
By default, the language is English (``language='en'``). Further supported langauges are: \
* Spanish ('es') \
* Portuguese ('pt') \
* Italian ('it') \
* French ('fr') \
* German ('de') \
* Farsi/Persian ('fa') \
* Indonesian ('id') \
* Simplified Chinese ('zh') \
* Japanese ('ja') \
* Korean ('ko')"
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "python310-emoji-2.6.0-1.1.noarch.rpm"
RPM_HASH = "2afedb8706c4dcfbe15c84570abf0ebc3bc74ca745198676d16853b9aa4260b458da53f64659497ad77c396bce387d697987a433e239711f6b324e486c9f8c4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-emoji \
python310-emoji \
python3dist-emoji"

RDEPENDS:${PN} += "python-abi"

inherit rpm
